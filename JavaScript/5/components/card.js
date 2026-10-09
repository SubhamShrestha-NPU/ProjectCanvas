const card = (main_img, pfp_style, pfp_seed, name, date) => {
    return `
        <!-- card -->
        <div id="card">
            <!-- main image -->
             <img src="${main_img}" alt="main image">

            <!-- card footer -->
            <div id="card_footer">
                <!-- profile -->
                <div id="profile">
                    <img src="https://api.dicebear.com/10.x/${pfp_style}/svg?seed=${pfp_seed}" alt="profile picture" id="profile_pic">
                    <div>
                        <p id="username">${name}</p>
                        <p id="date">${date}</p>
                    </div>
                </div>
                <!-- actions -->
                 <div id="actions">
                    <button class="material-icons" id="like">favorite_outline</button>
                    <button class="material-icons" id="comments">chat_bubble_outline</button>
                    <button class="material-icons" id="bookmark">bookmark_border</button>
                 </div>
            </div>
        </div>
    `;
}

export default card;