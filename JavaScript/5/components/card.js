const card = () => {
    return `
        <!-- card -->
        <div id="card">
            <!-- main image -->
             <img src="https://picsum.photos/600" alt="main image">

            <!-- card footer -->
            <div id="card_footer">
                <!-- profile -->
                <div id="profile">
                    <img src="https://api.dicebear.com/10.x/patchwork/svg?seed=1dej" alt="profile picture" id="profile_pic">
                    <div>
                        <p id="username">Jon Doe</p>
                        <p id="date">24 Mar, 2023</p>
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